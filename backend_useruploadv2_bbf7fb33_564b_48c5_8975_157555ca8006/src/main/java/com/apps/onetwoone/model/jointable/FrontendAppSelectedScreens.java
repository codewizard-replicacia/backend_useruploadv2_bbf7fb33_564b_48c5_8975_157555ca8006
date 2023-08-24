package com.apps.onetwoone.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.onetwoone.model.BuildTool;
import com.apps.onetwoone.model.FrontendApp;
import com.apps.onetwoone.model.Architecture;
import com.apps.onetwoone.model.Server;
import com.apps.onetwoone.model.PackageManagement;
import com.apps.onetwoone.model.FrontendScreen;
import com.apps.onetwoone.model.Project;
import com.apps.onetwoone.model.complex.BasicDetails;
import com.apps.onetwoone.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppSelectedScreens")
@Table(schema = "\"useruploadonetoonev2\"", name = "\"FrontendAppSelectedScreens\"")
@Data
public class FrontendAppSelectedScreens{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"FeScreenId\"")
    private Integer feScreenId;
 
}