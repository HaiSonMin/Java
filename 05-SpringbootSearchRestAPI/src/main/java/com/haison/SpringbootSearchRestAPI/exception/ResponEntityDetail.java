package com.haison.SpringbootSearchRestAPI.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponEntityDetail {
    private int status;
    private String message;
    private String path;
    private LocalDateTime timeStamp;
}
