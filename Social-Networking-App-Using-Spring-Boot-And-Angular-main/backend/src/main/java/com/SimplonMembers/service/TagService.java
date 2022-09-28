package com.SimplonMembers.service;

import java.util.List;

import com.SimplonMembers.entity.Tag;

public interface TagService {
    Tag getTagById(Long id);
    Tag getTagByName(String name);
    Tag createNewTag(String name);
    Tag increaseTagUseCounter(String name);
    Tag decreaseTagUseCounter(String name);
    List<Tag> getTimelineTags();
}
