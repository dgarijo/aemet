/**
 * Copyright (c) 2011 Ontology Engineering Group, 
 * Departamento de Inteligencia Artificial,
 * Facultad de Inform�tica, Universidad 
 * Polit�cnica de Madrid, Spain
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package es.upm.fi.dia.oeg.map4rdf.client.action;

import java.io.Serializable;
import java.util.Set;

import es.upm.fi.dia.oeg.map4rdf.share.BoundingBox;
import es.upm.fi.dia.oeg.map4rdf.share.FacetConstraint;

/**
 * @author Alexander De Leon
 */
public class GetGeoResourcesBase implements Serializable {

	private BoundingBox boundingBox;
	private Set<FacetConstraint> facetConstraints;

	GetGeoResourcesBase() {
		// for serialization
	}

	public GetGeoResourcesBase(BoundingBox boundingBox) {
		this.boundingBox = boundingBox;
	}

	public BoundingBox getBoundingBox() {
		return boundingBox;
	}

	public Set<FacetConstraint> getFacetConstraints() {
		return facetConstraints;
	}

	public void setFacetConstraints(Set<FacetConstraint> facetConstraints) {
		this.facetConstraints = facetConstraints;
	}

}
