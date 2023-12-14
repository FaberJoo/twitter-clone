package com.twitter.api.global.response;

import java.util.List;
import lombok.Getter;
import org.springframework.data.domain.Slice;

@Getter
public class SliceResponse<T> {
  private final List<T> items;
  private final int size; // 한 페이지에 보여줄 아이템의 개수
  private String cursor; // 마지막 아이템의 id

  public SliceResponse(Slice<T> sliceContent, String property) {
    this.items = sliceContent.getContent();
    this.size = sliceContent.getSize();

    // 마지막 아이템의 id를 cursor로 설정
  }

  public SliceResponse(Slice<?> slice, List<T> items, String property) {
    this.items = items;
    this.size = slice.getSize();

    // 마지막 아이템의 id를 cursor로 설정
  }

  public static <T> SliceResponse<T> of(Slice<T> slice) {
    return new SliceResponse<>(slice, "id");
  }

  public static <T> SliceResponse<T> of(Slice<T> slice, String property) {
    return new SliceResponse<>(slice, property);
  }

  public static <T> SliceResponse<T> of(Slice<?> slice, List<T> items, String property) {
    return new SliceResponse<>(slice, items, property);
  }
}
