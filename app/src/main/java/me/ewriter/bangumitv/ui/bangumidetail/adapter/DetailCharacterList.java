package me.ewriter.bangumitv.ui.bangumidetail.adapter;

import java.util.List;

import me.drakeet.multitype.Item;
import me.ewriter.bangumitv.api.entity.AnimeCharacterEntity;

/**
 * Created by Zubin on 2016/9/27.
 */

public class DetailCharacterList implements Item {

    List<AnimeCharacterEntity> mList;

    public DetailCharacterList(List<AnimeCharacterEntity> mList) {
        this.mList = mList;
    }
}
