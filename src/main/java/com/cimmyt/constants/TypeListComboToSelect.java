/*
Copyright 2013 International Maize and Wheat Improvement Center
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
       http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.cimmyt.constants;

public enum TypeListComboToSelect {
	LOCATION_CATALOG("L","LOCATION"),
	SEASON_CATALOG("S","SEASON");
	private String id;
	private String value;

	private TypeListComboToSelect (String id, String value) {
		this.id = id;
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public String getId() {
		return this.id;
	}

	public static TypeListComboToSelect  lookupById(String id) {
		TypeListComboToSelect  result = null;

		for (TypeListComboToSelect column : TypeListComboToSelect .values()) {
			if (id.equals(column.getId())) {
				result = column;
				break; 
			}
		}

		return result;
	}
	
	public static TypeListComboToSelect  lookupByName(String name) {
		TypeListComboToSelect  result = null;

		for (TypeListComboToSelect  column : TypeListComboToSelect .values()) {
			if (name.equals(column.getValue())) {
				result = column;
				break;
			}
		}

		return result;
	}

}
