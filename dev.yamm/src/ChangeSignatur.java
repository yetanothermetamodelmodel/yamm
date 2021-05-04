import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class ChangeSignatur {

	public static void main(String[] args) throws IOException {

		String basePath = "/home/ai/arbeit/yamm/git/yamm";

		Path startingDir = Path.of(basePath);
		GetFilesToChange pf = new GetFilesToChange();
		pf.filesToChange = new ArrayList<>();
		Files.walkFileTree(startingDir, pf);

		pf.filesToChange.forEach((path -> {
			String content = "";
			try (InputStream inputStream = new FileInputStream(path.toFile())) {
				try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
					String line;
					while ((line = br.readLine()) != null) {
						if (line.equals(" * Copyright (C) 2019 dev.online, Ralf Buschermöhle"))
							content += " * Copyright (C) 2019 yamm.dev, Ralf Buschermöhle\n";
						else
							content += line + "\n";
					}
				} catch (Exception e2) {

				}
			} catch (Exception e1) {

			}
			FileOutputStream fos = null;
			BufferedWriter bw = null;
			try {
				fos = new FileOutputStream(path.toFile());
				bw = new BufferedWriter(new OutputStreamWriter(fos));
				bw.write(content);
				if (bw != null)
					bw.close();
					if (fos != null)

					fos.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}));

	}

	public static class GetFilesToChange extends SimpleFileVisitor<Path> {

		public static List<Path> filesToChange = new ArrayList<>();

		// Print information about
		// each type of file.
		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
			if (file.toString().endsWith(".java")) {
				try (InputStream inputStream = new FileInputStream(file.toFile())) {
					try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
						if (br.readLine() != null) {
							String line = br.readLine();
							if (line != null && line.equals(" * Copyright (C) 2019 dev.online, Ralf Buschermöhle")) {
								filesToChange.add(file);
							}
						}
					} catch (Exception e2) {

					}
				} catch (Exception e1) {

				}

			}
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult visitFileFailed(Path file, IOException exc) {
			System.err.println(exc);
			return FileVisitResult.CONTINUE;
		}
	}

}
