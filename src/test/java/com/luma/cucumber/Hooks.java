package com.luma.cucumber;

import com.luma.propertyreader.PropertyReader;
import com.luma.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
