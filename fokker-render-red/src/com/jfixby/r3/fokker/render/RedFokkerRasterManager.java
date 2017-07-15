
package com.jfixby.r3.fokker.render;

import java.io.IOException;

import com.jfixby.rana.api.asset.AssetsConsumer;
import com.jfixby.rana.api.asset.AssetsManager;
import com.jfixby.rana.api.asset.LoadedAssets;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.err.Err;

public class RedFokkerRasterManager implements AssetsConsumer {

	public RedFokkerRasterManager (final FokkerRenderMachine fokkerRenderMachine) {

// final ID bank = FOKKER_SYSTEM_ASSETS.LOCAL_R3_BANK_NAME;
// final PackagesBank group = PackagesManager.getBank(bank);
// if (group == null) {
// PackagesManager.printAllResources();
// Err.reportError("Resource not found: " + bank);
// }

// resource.rebuildIndex(this.reader);

		this.loadSystemAsset(fokkerRenderMachine.DefaultAssets().SHADER_GDX_DEFAULT);

		this.loadSystemAsset(fokkerRenderMachine.DefaultAssets().RASTER_IS_MISING());
// this.loadSystemAsset(FOKKER_SYSTEM_ASSETS.BLACK);
		this.loadSystemAsset(fokkerRenderMachine.DefaultAssets().BLACK());
// this.loadSystemAsset(FOKKER_SYSTEM_ASSETS.DEBUG_BLACK);
		this.loadSystemAsset(fokkerRenderMachine.DefaultAssets().DEBUG_BLACK());
// this.loadSystemAsset(FOKKER_SYSTEM_ASSETS.LOGO);
		this.loadSystemAsset(fokkerRenderMachine.DefaultAssets().LOGO());

// this.loadSystemAsset(FOKKER_SYSTEM_ASSETS.SHADER_TEST);

// SystemSettings.setSystemAssetID(FokkerEngineParams.Assets.RASTER_IS_MISING, FOKKER_SYSTEM_ASSETS.RASTER_IS_MISING);
// SystemSettings.setSystemAssetID(FokkerEngineParams.Assets.SPRITE_BLACK, FOKKER_SYSTEM_ASSETS.BLACK);
// SystemSettings.setSystemAssetID(FokkerEngineParams.Assets.SPRITE_BLACK_DEBUG, FOKKER_SYSTEM_ASSETS.DEBUG_BLACK);

	}

	private void loadSystemAsset (final ID asset_id) {
		try {
			AssetsManager.autoResolveAsset(asset_id);
		} catch (final IOException e) {
			e.printStackTrace();
			Err.reportError(e);
		}
		LoadedAssets.obtainAsset(asset_id, this);
	}

}