package com.example.domain.repository.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml")
public class SampleRepositoryTest {

    @Inject
    SampleRepository sampleRepository;

    @Test
    public void test() {
        List<Map<String, Object>> records = sampleRepository.findAll(Arrays.asList("Snafkin", "キー太"));
        System.out.println(records);
    }

}
