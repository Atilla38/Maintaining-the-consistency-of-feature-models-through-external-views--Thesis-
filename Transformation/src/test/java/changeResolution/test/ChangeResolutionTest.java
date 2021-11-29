package changeResolution.test;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;

import tools.vitruv.framework.change.description.VitruviusChange;
import tools.vitruv.framework.domains.DefaultStateBasedChangeResolutionStrategy;
import tools.vitruv.framework.domains.StateBasedChangeResolutionStrategy;
import transformations.Main;

class ChangeResolutionTest {

	@SuppressWarnings("static-access")
	@Test
	void testDefaultStateBasedChangeResolutionStrategy() {
		Main main = new Main();
		StateBasedChangeResolutionStrategy strategy = new DefaultStateBasedChangeResolutionStrategy();

		File featureIDEOldStateFile = new File("src/test/resource/changeResolution/FeatureIDE/oldState/oldStateCar.xml");
		File featureIDENewStateFile = new File("src/test/resource/changeResolution/FeatureIDE/newState/newStateCar.xml");

		Resource oldState = main.generateVaveModel(featureIDEOldStateFile, "oldStateCar",
				"src/test/resource/changeResolution/vave/oldState/");
		Resource newState = main.generateVaveModel(featureIDENewStateFile, "newStateCar",
				"src/test/resource/changeResolution/vave/newState/");

		VitruviusChange change = strategy.getChangeSequenceBetween(newState, oldState);
		System.out.println(change);

	}

}
