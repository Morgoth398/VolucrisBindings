# Yoga
```Java
public static void main(String[] args) {

	YogaLoader.loadNativeLibrary();

	YGNode root = Yoga.nodeNew();

	Yoga.nodeStyleSetWidth(root, 400);
	Yoga.nodeStyleSetHeight(root, 200);

	Yoga.nodeStyleSetFlexDirection(root, FlexDirection.YG_FLEX_DIRECTION_ROW);
	Yoga.nodeStyleSetJustifyContent(root, Justify.YG_JUSTIFY_SPACE_BETWEEN);
	Yoga.nodeStyleSetAlignItems(root, Align.YG_ALIGN_CENTER);

	for (int i = 0; i < 3; ++i) {
		YGNode child = Yoga.nodeNew();

		Yoga.nodeStyleSetWidth(child, 80);
		Yoga.nodeStyleSetHeight(child, 50);

		Yoga.nodeInsertChild(root, child, i);
	}

	Yoga.nodeCalculateLayout(
			root,
			400,
			200,
			Direction.YG_DIRECTION_LTR
	);

	for (int i = 0; i < Yoga.nodeGetChildCount(root); i++) {
		YGNode child = Yoga.nodeGetChild(root, i);

		System.out.println(
				"Child " + i +
				"\nx = " + Yoga.nodeLayoutGetLeft(child) +
				"\ny = " + Yoga.nodeLayoutGetTop(child) +
				"\nwidth = " + Yoga.nodeLayoutGetWidth(child) +
				"\nheight = " + Yoga.nodeLayoutGetHeight(child)
		);
		System.out.println("--------------");
	}
	
	Yoga.nodeFreeRecursive(root);
}
```