package com.swiftalgo.ms;

import io.aeron.driver.MediaDriver;

public class MediaDriverMain {

    public static void main(String[] args) {
        final MediaDriver driver = MediaDriver.launch(new MediaDriver.Context().aeronDirectoryName("aeron-data"));
    }
}
