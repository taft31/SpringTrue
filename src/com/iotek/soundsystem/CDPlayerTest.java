package com.iotek.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;


/**
 * Created by taft on 2016/10/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Resource
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull("²ÎÊýÎ´×¢Èë",cd);
        cd.play();
    }

}
