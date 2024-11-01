package org.example.lab_01.Singleton;

public final class VulkanDevice {
    private static VulkanDevice vulkanDevice = null;

    public static VulkanDevice getInstance() {
        if (vulkanDevice == null)
            vulkanDevice = new VulkanDevice();

        return vulkanDevice;
    }

    private VulkanDevice () {

    }
}
