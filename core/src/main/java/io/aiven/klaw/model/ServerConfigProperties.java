package io.aiven.klaw.model;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerConfigProperties {

  private String id;

  private String key;

  private String value;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ServerConfigProperties that)) return false;

    if (!Objects.equals(id, that.id)) return false;
    if (!Objects.equals(key, that.key)) return false;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return key != null ? key.hashCode() : 0;
  }
}
