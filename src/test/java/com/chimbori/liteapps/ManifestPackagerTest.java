package com.chimbori.liteapps;

import org.json.JSONException;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Ensures that all Lite Apps can be packaged without error.
 */
public class ManifestPackagerTest {
  @Test
  public void testAllManifestsPackagedSuccessfully() {
    ManifestPackager.packageAllManifests(new File("lite-apps/"));
  }

  @Test
  public void testLibraryDataIsGeneratedSuccessfully() {
    try {
      assertTrue(ManifestPackager.generateLibraryData());
    } catch (IOException | JSONException e) {
      fail(e.getMessage());
    }
  }
}
