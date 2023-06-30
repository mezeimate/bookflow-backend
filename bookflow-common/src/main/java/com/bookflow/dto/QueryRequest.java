package com.bookflow.dto;

import io.smallrye.common.constraint.NotNull;
import jakarta.enterprise.inject.Vetoed;
import lombok.Data;

@Vetoed
@Data
public class QueryRequest {

    @NotNull
    int pageIndex;

    @NotNull
    int pageSize;

}
