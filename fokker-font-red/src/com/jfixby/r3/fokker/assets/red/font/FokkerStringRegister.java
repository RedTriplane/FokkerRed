
package com.jfixby.r3.fokker.assets.red.font;

import com.jfixby.r3.fokker.api.FontParameters;
import com.jfixby.r3.fokker.assets.api.font.FokkerString;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Map;

public class FokkerStringRegister {
	final Map<ID, FokkerStringGroup> registry = Collections.newMap();

// public void register (final ID fontID, final FokkerString data) {

// this.registry.put(raster_id, data);
// }

	public FokkerString get (final ID fontID, final FontParameters fontParams, final String stringValue) {
		final FokkerStringGroup group = this.registry.get(fontID);
		return group.resolve(fontParams, stringValue);
	}
}
