package com.swiftalgo.ms.driver;

import io.aeron.driver.MediaDriver;

public class MediaDriverMain {

    public static void main(String[] args) {
        MediaDriver.launch(new MediaDriver.Context().aeronDirectoryName("aeron-data"));
    }
}
