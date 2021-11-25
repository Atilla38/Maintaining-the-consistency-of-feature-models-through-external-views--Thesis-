package comparators;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import transformations.Main;

public class RoundTripXMLComparator extends XMLComparator {
	protected String sourceFolderFeatureIDE = "src/test/resource/roundTrip/";
	private String targetFolderVave = "target/src/test/resource/models/vave/";
	

	public void generateRoundTripXMLFiles() {
		addFilesToList(fileList, "xml", sourceFolderFeatureIDE);
		for (File file : fileList) { // Generate for all XML files in the list a VaVe-Model with the same name.
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Main.generateVaveModel(file, name, targetFolderVave);
		}

		List<File> vaveFileList = new ArrayList<File>();
		addFilesToList(vaveFileList, "vavemodel", targetFolderVave);
		for (File file : vaveFileList) { // Generate for all .vavemodel files in the list a XML file with the same name.
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf("."));
			Main.generateFeatureIDEXMLFile(file, name, targetFolderFeatureIDE);
		}
	}

	public String getTargetFolderVave() {
		return this.targetFolderVave;
	}
}