package io.aiven.klaw.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity
@IdClass(TopicID.class)
@Table(name = "kwtopics")
public class Topic implements Serializable {

  @Id
  @Column(name = "topicid")
  private Integer topicid;

  @Id
  @Column(name = "tenantid")
  private Integer tenantId;

  @Column(name = "topicname")
  private String topicname;

  @Column(name = "env")
  private String environment;

  @Transient private List<String> environmentsList;

  @Column(name = "partitions")
  private Integer noOfPartitions;

  @Column(name = "replicationfactor")
  private String noOfReplicas;

  @Column(name = "teamid")
  private Integer teamId;

  @Column(name = "appname")
  private String appname;

  @Column(name = "otherparams")
  private String otherParams;

  @Column(name = "description")
  private String description;

  @Column(name = "documentation")
  private String documentation;

  @Column(name = "history")
  private String history;

  @Column(name = "jsonparams")
  private String jsonParams;

  @Transient private boolean isExistingTopic;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Topic topic)) return false;

    if (!Objects.equals(topicid, topic.topicid)) return false;
    return Objects.equals(tenantId, topic.tenantId);
  }

  @Override
  public int hashCode() {
    int result = topicid != null ? topicid.hashCode() : 0;
    result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
    return result;
  }
}
