- [] make all compilation (GamesScreen) outside of the RPCS3Activity lazy, aka, throttled so users can enjoy their phone more,while running in the background.
- [] make right Dpad (Cross Circle Square Triangle) not warp werdly (fisheye like?)
- [] fix insane ~3x movement speed of ControlPanel in OverlayEditActivity. Try and imitate movement of Button, or Dpad
- [] HOWEVER make right Dpad, when scaled down, (can't seem to reproduce with directional Dpad or buttons, but likely an edgier case) always follow finger wherever moved
  * it seems to only follow the finger when the finger is moved inside the Dpad. If the finger gets out of the Dpad (because it is moving too fast, for whatever reason), the Dpad will no longer follow the finger until it is placed within the Dpad again.
- [] complete implementation of game options (longpress DropdownMenu) in GamesScreen