package com.javarush.task.task19.task1904;

import java.io.IOException;

public interface PersonScanner {            // client
    Person read() throws IOException;

    void close() throws IOException;
}
