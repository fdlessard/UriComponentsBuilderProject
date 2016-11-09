package io.fdlessard.codebites.uribuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.ManagedArray;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fdlessard on 16-11-07.
 */
@Component
public class UriBuilderExamples {


    @Value("${url1}")
    private String url1;

    @Value("${url2}")
    private String url2;

    @Value("${pathfragment1}")
    private String pathFragment1;

    @Value("${pathfragment2}")
    private String pathFragment2;

    @Value("${pathfragment3}")
    private String pathFragment3;


    private String tenant = "tenantOne";
    private String version = "v1";


    public String buildUrlWithStringConcatenation() {

        return url1 + "/" + pathFragment1 + "/" + pathFragment2 + "/" + pathFragment3;
    }

    public String buildUrlWithStringFormat() {

        return String.format("%s/%s/%s/%s", url1, pathFragment1, pathFragment2, pathFragment3);
    }

    public String buildUrlWithStringJoin() {

        return String.join("/", url1, pathFragment1, pathFragment2, pathFragment3);
    }





    public String buildUrlWithSpringUriBuilder() {

        return UriComponentsBuilder.fromUriString(url2).buildAndExpand(tenant, version).toUriString();

    }

    public String buildUrlWithSpringUriBuilderMap() {

        Map<String, String> map = new HashMap<>();
        map.put("tenant", tenant);
        map.put("version", version);

        return UriComponentsBuilder.fromUriString(url2).buildAndExpand(map).toUriString();
    }

    public String buildUrlWithSpringUriBuilderWithParams() {

        return UriComponentsBuilder.fromUriString(url2).
                queryParam("firstName", "Mark").
                buildAndExpand(tenant, version).
                toUriString();
    }


}

