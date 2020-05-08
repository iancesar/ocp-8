package ocp.nio;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class FilesRead
{

	public static void main(String[] args) throws IOException, URISyntaxException
	{
		URI resources = FilesRead.class.getResource("/file.txt").toURI();

		List<String> allLines = Files.readAllLines(Paths.get(resources));

		allLines.forEach(System.out::println);

		Path path = Paths.get(resources);
		Map<String, Object> attrs = Files.readAttributes(path, "*", LinkOption.NOFOLLOW_LINKS);
		attrs.forEach((k, v) -> {
			System.out.println(MessageFormat.format("Attr {0} Value {1}", k, v));
		});
		
	}

}
