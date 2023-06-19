defmodule Solution do
  @spec merge(intervals :: [[integer]]) :: [[integer]]
  def merge(intervals) do
    [h | t] = Enum.sort_by(intervals, &hd/1) |> IO.inspect()

    t
    |> Enum.reduce([h], fn [current_start, current_end] = interval,
                           [[prev_start, prev_end] | t_acc] = acc ->
      if current_start <= prev_end do
        [[prev_start, max(current_end, prev_end)] | t_acc]
      else
        [interval | acc]
      end
    end)
    |> Enum.reverse()
  end
end
