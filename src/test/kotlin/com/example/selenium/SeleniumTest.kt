package com.example.selenium

import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class SeleniumTest {
    @Test
    fun kotlinHomePageSectionTextGetExample() {
        // indicate chromedriver place
        System.setProperty("webdriver.chrome.driver", "/Users/raishin/Downloads/selenium/driver/chromedriver")

        // ヘッドレスモードにして
        val options = ChromeOptions().apply {
            addArguments("--headless")
        }
        val driver: WebDriver = ChromeDriver(options)

        // access kotlin home page and get section-content text by class name
        driver.get("https://programmercollege.jp/column/15693/#section700")
        val sectionContent = driver.findElement(By.className("singleHead"))

        // output result
        println(sectionContent.text)

        // close chrome
        driver.close()
    }
}