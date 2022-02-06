package io.rookware.springsecurityfull.security;

import com.google.common.collect.Sets;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static io.rookware.springsecurityfull.security.ApplicationUserPermission.*;

@RequiredArgsConstructor
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;
}
