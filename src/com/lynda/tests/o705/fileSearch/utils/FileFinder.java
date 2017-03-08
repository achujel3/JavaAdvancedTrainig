package com.lynda.tests.o705.fileSearch.utils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class FileFinder extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;
    public ArrayList<Path> foundPaths = new ArrayList<>();

    public FileFinder(String pattern) {
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path name = path.getFileName();
//        System.out.println("Examining: " + name);
        if (matcher.matches(name)) {
            foundPaths.add(path);
        }
        return FileVisitResult.CONTINUE;
    }
}