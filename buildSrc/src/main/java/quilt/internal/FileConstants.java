package quilt.internal;

import java.io.File;

import org.gradle.api.Project;

public class FileConstants {
    public final File cacheFilesMinecraft;
    public final File tempDir;
    public final File perVersionMappingsJar;
    public final File unpickedJar;
    public final File namedJar;
    public final File libraries;

    public FileConstants(Project project) {
        cacheFilesMinecraft = project.file(".gradle/minecraft");
        tempDir = project.file(".gradle/temp");
        libraries = new File(cacheFilesMinecraft, "libraries");

        perVersionMappingsJar = project.file(Constants.MINECRAFT_VERSION + "-" + Constants.PER_VERSION_MAPPINGS_NAME + ".jar");
        unpickedJar = project.file(Constants.MINECRAFT_VERSION + "-" + Constants.PER_VERSION_MAPPINGS_NAME + "-unpicked.jar");
        namedJar = project.file(Constants.MINECRAFT_VERSION + "-named.jar");
    }
}
