package com.apps.onetwoone.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.onetwoone.model.BuildTool;
import com.apps.onetwoone.model.FrontendApp;
import com.apps.onetwoone.model.Architecture;
import com.apps.onetwoone.model.Server;
import com.apps.onetwoone.model.PackageManagement;
import com.apps.onetwoone.model.FrontendScreen;
import com.apps.onetwoone.model.Project;
import com.apps.onetwoone.model.complex.BasicDetails;
import com.apps.onetwoone.model.complex.AdvancedDetails;
import com.apps.onetwoone.converter.DurationConverter;
import com.apps.onetwoone.converter.UUIDToByteConverter;
import com.apps.onetwoone.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Server")
@Table(name = "\"Server\"", schema =  "\"useruploadonetoonev2\"")
@Data
                        
public class Server {
	public Server () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Id\"", nullable = true )
  private Integer id;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Description\"", nullable = true )
  private String description;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Server [" 
  + "Id= " + id  + ", " 
  + "Name= " + name  + ", " 
  + "Description= " + description 
 + "]";
	}
	
}