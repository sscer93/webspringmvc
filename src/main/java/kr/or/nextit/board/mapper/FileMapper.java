package kr.or.nextit.board.mapper;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import kr.or.nextit.common.file.model.FileItem;

public interface FileMapper {
	
	public List<FileItem> selectFileItemList(Map<String, Object> paramMap) throws Exception;
	
	public FileItem selectFileItem(Map<String, Object> paramMap) throws Exception;
	
	public int insertFileItem(FileItem fileItem) throws Exception;
	
	public int deleteFileItem(Map<String, Object> paramMap) throws Exception;
	
	public int updateDownloadCnt(Map<String, Object> paramMap) throws Exception;
}
