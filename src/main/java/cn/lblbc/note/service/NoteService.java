package cn.lblbc.note.service;

import cn.lblbc.note.bean.Note;
import cn.lblbc.note.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 厦门大学计算机专业 | 前华为工程师
 * 专注《零基础学编程系列》  http://lblbc.cn/blog
 * 包含：Java | 安卓 | 前端 | Flutter | iOS | 小程序 | 鸿蒙
 * 公众号：蓝不蓝编程
 */
@Service
public class NoteService {
    @Autowired
    private NoteMapper noteMapper;

    public Note query(long id) {
        return noteMapper.query(id);
    }

    public void add(long userId, String content) {
        noteMapper.add(userId, content);
    }

    public void modify(long id, String content) {
        noteMapper.modify(id, content);
    }

    public void del(long id) {
        noteMapper.del(id);
    }

    public List<Note> queryByUserId(long userId) {
        return noteMapper.queryByUserId(userId);
    }
}
