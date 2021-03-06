/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import eDFDFlowTracking.Asset
import eDFDFlowTracking.AttackerProfile
import eDFDFlowTracking.EDFD
import eDFDFlowTracking.Element
import eDFDFlowTracking.TrustZone
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(EDFD eDFD, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Asset asset : eDFD.getAsset()) {
			asset.format;
		}
		for (Element element : eDFD.getElements()) {
			element.format;
		}
		for (TrustZone trustBoundary : eDFD.getTrustzones()) {
			trustBoundary.format;
		}
	}

	def dispatch void format(TrustZone trustBoundary, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (AttackerProfile attackerProfile : trustBoundary.getAttackerprofile()) {
			attackerProfile.format;
		}
		for (TrustZone _trustBoundary : trustBoundary.getSubzones()) {
			_trustBoundary.format;
		}
	}
	
	// TODO: implement for Asset, Process, ExternalEntity, Flow, DataStore
}
