package com.lynda.tests.o705.fileSearch;

import com.lynda.tests.o705.fileSearch.utils.FileFinder;
import com.lynda.tests.o705.fileSearch.utils.GetInput;
import com.lynda.tests.o705.fileSearch.utils.TextFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MainFileSearch {

    public static void main(String[] args) throws IOException {

        Path fileDir = Paths.get("src/com/lynda/tests");
        FileFinder finder = null;
        ArrayList<Path> foundFiles = null;

        String fileNameToSearch = GetInput.getInput("1. File name to search (0 to end): ");
        String textToSearch = GetInput.getInput("2. Text to search (0 to end): ");

        while (!textToSearch.equals("0") || !fileNameToSearch.equals("0")) {

            finder = new FileFinder(fileNameToSearch);
            Files.walkFileTree(fileDir, finder);

            foundFiles = finder.foundPaths;

            if (foundFiles.size() > 0) {
                for (Path path : foundFiles) {
                    if(TextFinder.isTextInPath(path, textToSearch)) {
                        System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
                    }
                }
            } else {
                System.out.println("No files were found!");
            }

            GetInput.pressEnterAndClearScreen();
            fileNameToSearch = GetInput.getInput("1. File name to search (0 to end): ");
            textToSearch = GetInput.getInput("2. Text to search (0 to end): ");
        }
    }

}
