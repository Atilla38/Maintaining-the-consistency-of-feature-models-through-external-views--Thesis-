package changeResolution.test;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;

import comparators.RoundTripXMLComparator;
import comparators.XMLComparator;
import transformations.Main;

public class ChangeResolutionFeatureIDE2VaveTest extends ChangeResolutionTest {

	@Test
	void testDefaultStateBasedChangeResolutionStrategyFeatureIDE2Vave() throws IOException {

		sourceFolderNewStateFeatureIDE = "src/test/resource/changeResolution/FeatureIDE/newState/";

		XMLComparator fileReader = new RoundTripXMLComparator();

		List<File> oldStateFileList = new ArrayList<File>();

		fileReader.addFilesToList(oldStateFileList, "xml", "src/test/resource/changeResolution/FeatureIDE/oldState/");

		for (File file : oldStateFileList) {
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Resource oldState = Main.generateVaveModel(file, name, targetFolderOldStateVave);

			this.changeResolutionEvolutionClass(oldState, name, specializationCounter);
		}

		/*
		 * File oldStateFile = new
		 * File("src/test/resource/changeResolution/FeatureIDE/failed/oldState/car.xml")
		 * ; File newStateFile = new File(
		 * "src/test/resource/changeResolution/FeatureIDE/failed/newState/car.xml");
		 * 
		 * Resource oldState = Main.generateVaveModel(oldStateFile, "car3",
		 * targetFolderOldStateVave); Resource newState =
		 * Main.generateVaveModel(newStateFile, "car3arbitrary",
		 * targetFolderNewStateVave);
		 * 
		 * VitruviusChange change = strategy.getChangeSequenceBetween(newState,
		 * oldState); System.out.println();
		 */

	}
}
