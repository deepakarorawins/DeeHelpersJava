package com.deesite.executeshellcommands;
import java.util.concurrent.Executors;
import java.io.*;

public class ShellCommandInJava {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		boolean isWindows = System.getProperty("os.name")
				  .toLowerCase().startsWith("windows");
		
		ProcessBuilder builder = new ProcessBuilder();
		if (isWindows) {
		    builder.command("cmd.exe", "/c", "dir");
		} else {
		    builder.command("sh", "-c", "ls -l");
		}
		builder.directory(new File(System.getProperty("user.home")));
		Process process = builder.start();
		StreamGobbler streamGobbler = 
		  new StreamGobbler(process.getInputStream(), System.out::println);
		Executors.newSingleThreadExecutor().submit(streamGobbler);
		int exitCode = process.waitFor();
		assert exitCode == 0;

	}

}


