package com.clz.slr.data;

import java.util.ArrayList;
import java.util.List;

import com.clz.db.Entity;

/**
 * 镜头分组
 * 超广角、广角、标准、中长焦、超长焦、微距、鱼眼
 * @author stevcao
 *
 */
public class LensGroup extends Entity {
	public String name;
	public List<Lens> lensList = new ArrayList<Lens>();
}
