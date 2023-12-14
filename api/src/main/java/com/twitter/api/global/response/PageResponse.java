package com.twitter.api.global.response;

import java.util.List;
import org.springframework.data.domain.Page;
import lombok.Getter;

@Getter
public class PageResponse<T> {

  private final List<T> items;
  private int page;
  private int size;
  private long totalElements;
  private int totalPages;

  public PageResponse(Page<T> page) {
    this.items = page.getContent();
    this.page = page.getNumber() + 1;
    this.size = page.getSize();
    this.totalElements = page.getTotalElements();
    this.totalPages = page.getTotalPages();
  }

  public static <T> PageResponse<T> of(Page<T> page) {
    return new PageResponse<>(page);
  }
}
