
package com.company.project.model.reqres.in;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuppressWarnings("unused")
public class ListUsers {

    @SerializedName("data")
    private List<User> usersList;
    @Expose
    private Long page;
    @SerializedName("per_page")
    private Long perPage;
    @Expose
    private Support support;
    @Expose
    private Long total;
    @SerializedName("total_pages")
    private Long totalPages;

}