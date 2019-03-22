package pkgShape;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid>{
	
	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int) Math.round(cub1.volume() - cub2.volume());
	}

}
