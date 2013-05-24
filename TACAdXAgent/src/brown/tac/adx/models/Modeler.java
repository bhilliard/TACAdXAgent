package brown.tac.adx.models;

import java.util.LinkedList;

import brown.tac.adx.predictions.DailyPrediction;

/**
 * Class containing a list of models and updating them in order of dependencies
 *  @author Veena Vignale
 */
public class Modeler {
	
	/*
	 * List of models
	 */
	LinkedList<Model> _modelList;
	
	public Modeler(String filename) {
		this.parseModels(filename);
	}

	/* Modifies and returns the DailyPrediction object */
	public DailyPrediction updateModels(DailyPrediction pred) {
		for (Model model : _modelList) {
			// This is meant to alter predictions with each iteration
			// as the models get updated.
			model.update(pred);
		}
		return pred;
	}
	
	/*
	 * Parses the XML file filename and fills in the model list
	 */
	private void parseModels(String filename) {
		
	}
	
}
