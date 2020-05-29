/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.impl.*;

import java.util.*;

/**
 * The <code>ALTER DOMAIN IF EXISTS</code> statement.
 */
@SuppressWarnings({ "hiding", "rawtypes", "unchecked", "unused" })
final class AlterDomainImpl<T>
extends
    AbstractRowCountQuery
implements
    AlterDomainStep<T>,
    AlterDomainDropConstraintCascadeStep,
    AlterDomainRenameConstraintStep,
    AlterDomainFinalStep
{

    private static final long serialVersionUID = 1L;

    private final Domain<T>  domain;
    private final boolean    alterDomainIfExists;
    private       Constraint addConstraint;
    private       Constraint dropConstraint;
    private       boolean    dropConstraintIfExists;
    private       Domain<?>  renameTo;
    private       Constraint renameConstraint;
    private       boolean    renameConstraintIfExists;
    private       Field<T>   setDefault;
    private       boolean    dropDefault;
    private       boolean    setNotNull;
    private       boolean    dropNotNull;
    private       Boolean    cascade;
    private       Constraint renameConstraintTo;
    
    AlterDomainImpl(
        Configuration configuration,
        Domain domain,
        boolean alterDomainIfExists
    ) {
        this(
            configuration,
            domain,
            alterDomainIfExists,
            null,
            null,
            false,
            null,
            null,
            false,
            null,
            false,
            false,
            false,
            null,
            null
        );
    }

    AlterDomainImpl(
        Configuration configuration,
        Domain domain,
        boolean alterDomainIfExists,
        Constraint addConstraint,
        Constraint dropConstraint,
        boolean dropConstraintIfExists,
        Domain renameTo,
        Constraint renameConstraint,
        boolean renameConstraintIfExists,
        Field setDefault,
        boolean dropDefault,
        boolean setNotNull,
        boolean dropNotNull,
        Boolean cascade,
        Constraint renameConstraintTo
    ) {
        super(configuration);

        this.domain = domain;
        this.alterDomainIfExists = alterDomainIfExists;
        this.addConstraint = addConstraint;
        this.dropConstraint = dropConstraint;
        this.dropConstraintIfExists = dropConstraintIfExists;
        this.renameTo = renameTo;
        this.renameConstraint = renameConstraint;
        this.renameConstraintIfExists = renameConstraintIfExists;
        this.setDefault = setDefault;
        this.dropDefault = dropDefault;
        this.setNotNull = setNotNull;
        this.dropNotNull = dropNotNull;
        this.cascade = cascade;
        this.renameConstraintTo = renameConstraintTo;
    }

    final Domain<T>  $domain()                   { return domain; }
    final boolean    $alterDomainIfExists()      { return alterDomainIfExists; }
    final Constraint $addConstraint()            { return addConstraint; }
    final Constraint $dropConstraint()           { return dropConstraint; }
    final boolean    $dropConstraintIfExists()   { return dropConstraintIfExists; }
    final Domain<?>  $renameTo()                 { return renameTo; }
    final Constraint $renameConstraint()         { return renameConstraint; }
    final boolean    $renameConstraintIfExists() { return renameConstraintIfExists; }
    final Field<T>   $setDefault()               { return setDefault; }
    final boolean    $dropDefault()              { return dropDefault; }
    final boolean    $setNotNull()               { return setNotNull; }
    final boolean    $dropNotNull()              { return dropNotNull; }
    final Boolean    $cascade()                  { return cascade; }
    final Constraint $renameConstraintTo()       { return renameConstraintTo; }

    // -------------------------------------------------------------------------
    // XXX: DSL API
    // -------------------------------------------------------------------------
    
    @Override
    public final AlterDomainImpl<T> add(Constraint addConstraint) {
        this.addConstraint = addConstraint;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> dropConstraint(String dropConstraint) {
        return dropConstraint(DSL.constraint(DSL.name(dropConstraint)));
    }

    @Override
    public final AlterDomainImpl<T> dropConstraint(Name dropConstraint) {
        return dropConstraint(DSL.constraint(dropConstraint));
    }

    @Override
    public final AlterDomainImpl<T> dropConstraint(Constraint dropConstraint) {
        this.dropConstraint = dropConstraint;
        this.dropConstraintIfExists = false;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> dropConstraintIfExists(String dropConstraint) {
        return dropConstraintIfExists(DSL.constraint(DSL.name(dropConstraint)));
    }

    @Override
    public final AlterDomainImpl<T> dropConstraintIfExists(Name dropConstraint) {
        return dropConstraintIfExists(DSL.constraint(dropConstraint));
    }

    @Override
    public final AlterDomainImpl<T> dropConstraintIfExists(Constraint dropConstraint) {
        this.dropConstraint = dropConstraint;
        this.dropConstraintIfExists = true;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> renameTo(String renameTo) {
        return renameTo(DSL.domain(DSL.name(renameTo)));
    }

    @Override
    public final AlterDomainImpl<T> renameTo(Name renameTo) {
        return renameTo(DSL.domain(renameTo));
    }

    @Override
    public final AlterDomainImpl<T> renameTo(Domain<?> renameTo) {
        this.renameTo = renameTo;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> renameConstraint(String renameConstraint) {
        return renameConstraint(DSL.constraint(DSL.name(renameConstraint)));
    }

    @Override
    public final AlterDomainImpl<T> renameConstraint(Name renameConstraint) {
        return renameConstraint(DSL.constraint(renameConstraint));
    }

    @Override
    public final AlterDomainImpl<T> renameConstraint(Constraint renameConstraint) {
        this.renameConstraint = renameConstraint;
        this.renameConstraintIfExists = false;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> renameConstraintIfExists(String renameConstraint) {
        return renameConstraintIfExists(DSL.constraint(DSL.name(renameConstraint)));
    }

    @Override
    public final AlterDomainImpl<T> renameConstraintIfExists(Name renameConstraint) {
        return renameConstraintIfExists(DSL.constraint(renameConstraint));
    }

    @Override
    public final AlterDomainImpl<T> renameConstraintIfExists(Constraint renameConstraint) {
        this.renameConstraint = renameConstraint;
        this.renameConstraintIfExists = true;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> setDefault(T setDefault) {
        return setDefault(Tools.field(setDefault));
    }

    @Override
    public final AlterDomainImpl<T> setDefault(Field<T> setDefault) {
        this.setDefault = setDefault;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> dropDefault() {
        this.dropDefault = true;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> setNotNull() {
        this.setNotNull = true;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> dropNotNull() {
        this.dropNotNull = true;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> cascade() {
        this.cascade = true;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> restrict() {
        this.cascade = false;
        return this;
    }

    @Override
    public final AlterDomainImpl<T> to(String renameConstraintTo) {
        return to(DSL.constraint(DSL.name(renameConstraintTo)));
    }

    @Override
    public final AlterDomainImpl<T> to(Name renameConstraintTo) {
        return to(DSL.constraint(renameConstraintTo));
    }

    @Override
    public final AlterDomainImpl<T> to(Constraint renameConstraintTo) {
        this.renameConstraintTo = renameConstraintTo;
        return this;
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------



    private static final Set<SQLDialect> NO_SUPPORT_RENAME_CONSTRAINT_IF_EXISTS = SQLDialect.supportedBy(FIREBIRD, POSTGRES);
    private static final Set<SQLDialect> NO_SUPPORT_DROP_CONSTRAINT_IF_EXISTS   = SQLDialect.supportedBy(FIREBIRD, POSTGRES);

    private final boolean supportsRenameConstraintIfExists(Context<?> ctx) {
        return !NO_SUPPORT_RENAME_CONSTRAINT_IF_EXISTS.contains(ctx.family());
    }

    private final boolean supportsDropConstraintIfExists(Context<?> ctx) {
        return !NO_SUPPORT_DROP_CONSTRAINT_IF_EXISTS.contains(ctx.family());
    }

    @Override
    public final void accept(Context<?> ctx) {
        if (renameConstraintIfExists && !supportsRenameConstraintIfExists(ctx)) {
            Tools.beginTryCatch(ctx, DDLStatementType.ALTER_DOMAIN);
            accept0(ctx);
            Tools.endTryCatch(ctx, DDLStatementType.ALTER_DOMAIN);
        }
        else
            accept0(ctx);
    }

    private final void accept0(Context<?> ctx) {
        Object previous = ctx.data(DATA_CONSTRAINT_REFERENCE);

        ctx.visit(K_ALTER).sql(' ').visit(K_DOMAIN).sql(' ');

        if (alterDomainIfExists)
            ctx.visit(K_IF_EXISTS).sql(' ');

        ctx.visit(domain).sql(' ');

        if (addConstraint != null) {
            if (ctx.family() == FIREBIRD)
                ctx.visit(K_ADD).sql(' ').visit(DSL.check(((ConstraintImpl) addConstraint).$check()));
            else
                ctx.visit(K_ADD).sql(' ').visit(addConstraint);
        }
        else if (dropConstraint != null) {
            ctx.visit(K_DROP_CONSTRAINT);

            if (dropConstraintIfExists && supportsDropConstraintIfExists(ctx))
                ctx.sql(' ').visit(K_IF_EXISTS);

            if (ctx.family() != FIREBIRD) {
                ctx.data(DATA_CONSTRAINT_REFERENCE, true);
                ctx.sql(' ').visit(dropConstraint);
                ctx.data(DATA_CONSTRAINT_REFERENCE, previous);

                if (cascade != null)
                    if (cascade)
                        ctx.sql(' ').visit(K_CASCADE);
                    else
                        ctx.sql(' ').visit(K_RESTRICT);
            }
        }
        else if (renameTo != null) {
            ctx.data(DATA_CONSTRAINT_REFERENCE, true);
            ctx.visit(ctx.family() == FIREBIRD ? K_TO : K_RENAME_TO).sql(' ').visit(renameTo);
            ctx.data(DATA_CONSTRAINT_REFERENCE, previous);
        }
        else if (renameConstraint != null) {
            ctx.data(DATA_CONSTRAINT_REFERENCE, true);
            ctx.visit(K_RENAME_CONSTRAINT).sql(' ');

            if (renameConstraintIfExists && supportsRenameConstraintIfExists(ctx))
                ctx.visit(K_IF_EXISTS).sql(' ');

            ctx.visit(renameConstraint).sql(' ').visit(K_TO).sql(' ').visit(renameConstraintTo);
            ctx.data(DATA_CONSTRAINT_REFERENCE, previous);
        }
        else if (setDefault != null) {
            ctx.visit(K_SET_DEFAULT).sql(' ').visit(setDefault);
        }
        else if (dropDefault) {
            ctx.visit(K_DROP_DEFAULT);
        }
        else if (setNotNull) {
            ctx.visit(K_SET_NOT_NULL);
        }
        else if (dropNotNull) {
            ctx.visit(K_DROP_NOT_NULL);
        }
    }


}
