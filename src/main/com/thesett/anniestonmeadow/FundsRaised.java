/*
 * Copyright The Sett Ltd, 2005 to 2009.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thesett.anniestonmeadow;

import java.math.BigDecimal;

public class FundsRaised
{
    private BigDecimal value = BigDecimal.ZERO;
    private BigDecimal target = new BigDecimal(700);

    public BigDecimal getValue()
    {
        return value;
    }

    public void setValue(BigDecimal value)
    {
        this.value = value;
    }

    public BigDecimal getTarget()
    {
        return target;
    }

    public void setTarget(BigDecimal target)
    {
        this.target = target;
    }

    public int getPercentage()
    {
        int result = 0;

        try
        {
            result = (value.intValue() * 100) / target.intValue();
        }
        catch (ArithmeticException e)
        {
            // Exception set to null, as compensating action of setting the result to zero is taken.
            e = null;
        }

        result = (result > 100) ? 100 : result;
        result = (result < 0) ? 0 : result;

        return result;
    }
}
