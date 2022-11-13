# Material-Design-Components-P01
The Bottom App Bar is an extension of Toolbar 
that supports a shaped background that
"cradles" an attached FloatingActionButton. 
A FAB is anchored to BottomAppBar by calling
CoordinatorLayout.LayoutParams.setAnchorId(int),
or by setting app:layout_anchor on the FAB in 
xml.
Note: The Material Design Guidelines caution
against using an ExtendedFloatingActionButton 
with a BottomAppBar, so there is limited support
for that use case. ExtendedFloatingActionButton
can be anchored to the BottomAppBar, but 
currently animations and the cutout are not 
supported.
There are two modes which determine where the 
FAB is shown relative to the BottomAppBar.
FAB_ALIGNMENT_MODE_CENTER mode is the primary 
mode with the FAB is centered. 
FAB_ALIGNMENT_MODE_END is the secondary mode 
with the FAB on the side.

Do not use the android:background attribute or 
call BottomAppBar.setBackground because the 
BottomAppBar manages its background internally. 
Instead use app:backgroundTint.

To enable color theming for menu items 
you will also need to set the 
materialThemeOverlay attribute to a 
ThemeOverlay which sets the colorControlNormal
 attribute to the correct color. 
For example, if the background of the
 BottomAppBar is colorSurface, 
as it is in the default style, 
you should set materialThemeOverlay to 
@style/ThemeOverlay.MaterialComponents.
BottomAppBar.Surface.
