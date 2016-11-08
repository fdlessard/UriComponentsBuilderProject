package io.fdlessard.codesamples.uribuilder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UriBuilderExamplesTest {

	@Autowired
	private UriBuilderExamples uriBuilderExamples;

	@Before
	public void setUp() {

	}

    @Test
    public void buildUrlWithStringConcatenation() {
        String urlString = uriBuilderExamples.buildUrlWithStringConcatenation();
        System.out.println(urlString);
    }

    @Test
    public void buildUrlWithStringFormat() {
        String urlString = uriBuilderExamples.buildUrlWithStringFormat();
        System.out.println(urlString);
    }

    @Test
    public void buildUrlWithStringJoin() {
        String urlString = uriBuilderExamples.buildUrlWithStringJoin();
        System.out.println(urlString);
    }

    @Test
    public void buildUrlWithSpringUriBuilder() {
        String urlString = uriBuilderExamples.buildUrlWithSpringUriBuilder();
        System.out.println(urlString);
    }

	@Test
	public void buildUrlWithSpringUriBuilderMap() {
		String urlString = uriBuilderExamples.buildUrlWithSpringUriBuilderMap();
		System.out.println(urlString);

	}
}
