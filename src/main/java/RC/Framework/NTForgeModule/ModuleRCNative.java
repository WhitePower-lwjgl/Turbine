////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.NTForgeModule;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.versioning.ArtifactVersion;

import java.util.Collections;

@Mod(name = ModuleRCNative.Ref.name, modid = ModuleRCNative.Ref.modid)
public class ModuleRCNative
{
	public class Ref
	{
		public static final String modid = "RCNative";
		public static final String name = "RC.Native";
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.getModMeta(event.getModMetadata());
	}

	private void getModMeta(ModMetadata meta)
	{
		meta.dependencies = Collections.singletonList((ArtifactVersion)new ArtifactVersionRCFramework());
		meta.logoFile = "Image\\logo.rc.framework.png";
		meta.credits = "By Whisper";
		meta.authorList = Collections.singletonList("Whisper");
		meta.description = "CSharp Power!";
		meta.name = Ref.name;
		meta.modId = Ref.modid;
	}
}