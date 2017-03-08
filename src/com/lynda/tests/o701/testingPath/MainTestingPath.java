package com.lynda.tests.o701.testingPath;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainTestingPath {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/com/lynda/tests/o604/testingCustomExceptions/files/GoodFile.txt");

        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());

        System.out.println(getCustomPath(path));

        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(getCustomPath(realPath));

    }

    /**
     * Method which is return the path in custom String
     *
     * @param path
     * @return
     */
    private static String getCustomPath(Path path){
        StringBuilder stringBuilder = new StringBuilder("Path is: ");
        if(path != null) {
            int count = path.getNameCount();
            for(int i = 0; i < count; i++) {
                stringBuilder.append(path.getName(i));
                if(!(i+1 == count)) {
                    stringBuilder.append(" -> ");
                }
            }
            return stringBuilder.toString();
        } else {
            return "";
        }

    }

}

