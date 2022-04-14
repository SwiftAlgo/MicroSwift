package com.swiftalgo.ms.driver;

import io.aeron.archive.Archive;
import io.aeron.archive.ArchivingMediaDriver;
import io.aeron.driver.MediaDriver;

import java.io.File;

public class MediaDriverMain {

    public static void main(String[] args) {

        ArchivingMediaDriver.launch(
                new MediaDriver.Context()
                        .aeronDirectoryName("aeron-data")
                        .spiesSimulateConnection(true).dirDeleteOnStart(true),
                new Archive.Context()
                        .deleteArchiveOnStart(true)
                        .archiveDir(new File("aeron-archive"))
        );
    }
}
