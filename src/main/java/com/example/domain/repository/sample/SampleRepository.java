package com.example.domain.repository.sample;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SampleRepository {

    List<Map<String,Object>> findAll(@Param("authors") List<String> authors);
}
