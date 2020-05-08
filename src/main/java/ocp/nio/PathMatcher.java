package ocp.nio;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcher
{
	static boolean f;

	public static void main(String[] args) throws URISyntaxException, IOException
	{
		URI resources = PathMatcher.class.getResource("/path").toURI();
		FileVisitor<Path> searcher = new Search();

		Files.walkFileTree(Paths.get(resources), searcher);

		if(!f)
		{
			System.out.println("Not Matches");
		}
	}

	private static final class Search extends SimpleFileVisitor<Path>
	{
		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
		{
			java.nio.file.PathMatcher pm = FileSystems.getDefault().getPathMatcher("regex:");
			if(pm.matches(file.getFileName()))
			{
				System.out.println(file);
				f = true;
			}
			return FileVisitResult.CONTINUE;
		}
	}
}
