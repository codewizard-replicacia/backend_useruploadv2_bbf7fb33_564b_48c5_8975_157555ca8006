package com.apps.onetwoone.function;

import com.apps.onetwoone.model.BuildTool;
import com.apps.onetwoone.model.FrontendApp;
import com.apps.onetwoone.model.Architecture;
import com.apps.onetwoone.model.Server;
import com.apps.onetwoone.model.PackageManagement;
import com.apps.onetwoone.model.FrontendScreen;
import com.apps.onetwoone.model.Project;
import com.apps.onetwoone.model.complex.BasicDetails;
import com.apps.onetwoone.model.complex.AdvancedDetails;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.onetwoone.repository.PackageManagementRepository;
import com.apps.onetwoone.repository.ProjectRepository;
import com.apps.onetwoone.repository.ArchitectureRepository;
import com.apps.onetwoone.repository.ServerRepository;
import com.apps.onetwoone.repository.FrontendScreenRepository;
import com.apps.onetwoone.repository.BuildToolRepository;
import com.apps.onetwoone.repository.FrontendAppRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
