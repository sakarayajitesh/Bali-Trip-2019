package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.flashbox.balitrip2019.DataBinderMapperImpl());
  }
}
